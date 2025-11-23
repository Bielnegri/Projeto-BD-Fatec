package fatec.lanchoneteapp.application.service;

import fatec.lanchoneteapp.adapters.repository.CargoRepository;
import fatec.lanchoneteapp.application.exception.CargoInvalidoException;
import fatec.lanchoneteapp.application.exception.CargoNaoEncontradoException;
import fatec.lanchoneteapp.domain.entity.Cargo;
import fatec.lanchoneteapp.domain.entity.Cliente;

import java.sql.SQLException;
import java.util.List;

public class CargoService {
    private final CargoRepository cargoRepository;

    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public void criarCargo(Cargo cargo) throws SQLException, CargoInvalidoException {
        if(!validarCargo(cargo))
            throw new CargoInvalidoException("Cargo já cadastrado");

        cargoRepository.salvar(cargo);
    }

    public void atualizarCargo(Cargo cargo) throws SQLException {
        cargoRepository.atualizar(cargo);
    }

    public Cargo buscarCargo(int idCargo) throws SQLException, CargoNaoEncontradoException {
        Cargo cargo = cargoRepository.buscarPorID(new Cargo(idCargo));

        if(cargo == null)
            throw new CargoNaoEncontradoException("Cargo não encontrado");

        return cargo;
    }

    public void excluirCargo(Cargo cargo) throws SQLException {
        cargoRepository.excluir(cargo);
    }

    public List<Cargo> listarCargos() throws SQLException {
        return cargoRepository.listar();
    }

    public boolean validarCargo(Cargo cargo) throws SQLException {
        try {
            buscarCargo(cargo.getId());
            return false;
        } catch(CargoNaoEncontradoException e) {
            return true;
        }
    }
}
