package Controller;

import Model.Patienten;
import Repository.PatientenRepository;

import java.util.List;

public class PatientenController implements IController<Patienten, Integer> {
    private final PatientenRepository repository;

    public PatientenController(PatientenRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Patienten entity) {
        repository.add(entity);
    }

    @Override
    public void delete(Integer entity) {
        repository.delete(entity);
    }

    @Override
    public void update(Patienten entity1, Patienten entity2) {
        repository.update(entity1, entity2);
    }

    @Override
    public Patienten get(Integer entity) {
        return repository.get(entity);
    }

    @Override
    public List<Patienten> getAll() {
        return repository.getAll();
    }
}
