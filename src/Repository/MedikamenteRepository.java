package Repository;

import Model.Medikamente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MedikamenteRepository implements IRepository<Medikamente, String> {
    private final List<Medikamente> medikamente;
    public MedikamenteRepository(List<Medikamente> medikamente) {
        this.medikamente = medikamente;
    }

    public MedikamenteRepository() {this.medikamente = new ArrayList<>();}


    @Override
    public void add(Medikamente entity) {
        medikamente.add(entity);
    }

    @Override
    public void delete(String entity) {
        medikamente.removeIf(medkament -> Objects.equals(medkament.getName(), entity));
    }

    @Override
    public void update(Medikamente entity1, Medikamente entity2) {
        medikamente.remove(entity1);
        medikamente.add(entity2);
    }

    @Override
    public Medikamente get(String entity) {
        for(Medikamente m : medikamente) {
            if(Objects.equals(m.getName(), entity)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public List<Medikamente> getAll() {
        return medikamente;
    }
}
