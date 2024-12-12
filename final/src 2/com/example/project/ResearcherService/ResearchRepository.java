package com.example.project.ResearcherService;

public interface ResearchRepository {
    void addResearcher(Researcher researcher);

    void deleteResearcher(String id);

    void updateResearcher(String id, Researcher updatedResearcher);

    Researcher findResearcherById(String id);
}