package Controller;

import Model.Medikamente;
import Repository.MedikamenteRepository;

import java.util.List;

public class MedikamenteController implements IController<Medikamente, String> {
    private final MedikamenteRepository repository;

    public MedikamenteController(MedikamenteRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Medikamente entity) {
        repository.add(entity);
    }

    @Override
    public void delete(String entity) {
        repository.delete(entity);
    }

    @Override
    public void update(Medikamente entity1, Medikamente entity2) {
        repository.update(entity1, entity2);
    }

    @Override
    public Medikamente get(String entity) {
        return repository.get(entity);
    }

    @Override
    public List<Medikamente> getAll() {
        return repository.getAll();
    }
}
