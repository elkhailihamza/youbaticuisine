package Services;

import Models.Components;
import Repositories.ComponentRepository;

import java.util.List;

public class ComponentService {
    private final ComponentRepository componentRepository;

    public ComponentService(ComponentRepository componentRepository) {
        this.componentRepository = componentRepository;
    }

    public Components findById(long id) {
        return this.componentRepository.findById(id);
    }

    public List<Components> fetchAll() {
        return this.componentRepository.fetchAll();
    }

    public void save(Components entity) {
        this.componentRepository.save(entity);
    }

    public void update(Components entity) {
        this.componentRepository.update(entity);
    }

    public void delete(Components entity) {
        this.componentRepository.delete(entity);
    }

    public Components addMaterial(String nom, String type, double tauxTVA, long projectId) {
        return new Components(1, nom, type, tauxTVA, projectId);
    }
}