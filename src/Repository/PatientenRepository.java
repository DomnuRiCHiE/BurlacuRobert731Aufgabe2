package Repository;

import Model.Patienten;

import java.util.ArrayList;
import java.util.List;

public class PatientenRepository implements IRepository<Patienten, Integer> {
    private final List<Patienten> patientens;

    public PatientenRepository(List<Patienten> patientens) {this.patientens = patientens;}
    public PatientenRepository() {this.patientens = new ArrayList<Patienten>();}

    @Override
    public void add(Patienten entity) {
        patientens.add(entity);
    }

    @Override
    public void delete(Integer entity) {
        patientens.removeIf(patienten -> patienten.getId() == entity);
    }

    @Override
    public void update(Patienten entity1, Patienten entity2) {
        patientens.remove(entity1);
        patientens.add(entity2);
    }

    @Override
    public Patienten get(Integer entity) {
        for(Patienten patienten : patientens) {
            if(patienten.getId() == entity) {
                return patienten;
            }
        }
        return null;
    }

    @Override
    public List<Patienten> getAll() {
        return patientens;
    }
}
