package com.example.project.ResearcherService;

import java.util.HashMap;
import java.util.Map;

public class ReseacherRepositoryImpl implements ResearchRepository {
    private Map<String, Researcher> researcherMap = new HashMap<>();

    @Override
    public void addResearcher(Researcher researcher) {
        researcherMap.put(researcher.getId(), researcher);
        System.out.println("Researcher added: " + researcher.getName());
    }

    @Override
    public void deleteResearcher(String id) {
        Researcher removed = researcherMap.remove(id);
        if (removed != null) {
            System.out.println("Researcher removed: " + removed.getName());
        } else {
            System.out.println("No researcher found with ID: " + id);
        }
    }

    @Override
    public void updateResearcher(String id, Researcher updatedResearcher) {
        researcherMap.put(id, updatedResearcher);
        System.out.println("Researcher updated: " + updatedResearcher.getName());
    }

    @Override
    public Researcher findResearcherById(String id) {
        return researcherMap.get(id);
    }
}