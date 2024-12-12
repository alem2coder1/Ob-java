package com.example.project.ResearcherService;

import com.example.project.boss.User;
import com.example.project.boss.UserController;

import java.util.List;

public class ResearchController extends UserController {
    private ResearchRepository researchRepository;

    public ResearchController(ResearchRepository researchRepository) {
        this.researchRepository = researchRepository;
    }

    public void addResearcher(Researcher researcher) {
        addUser(researcher);
        researchRepository.addResearcher(researcher);
    }

    public void deleteResearcher(String id) {
        removeUserById(id);
        researchRepository.deleteResearcher(id);
    }

    public void updateResearcher(String id, Researcher updatedResearcher) {
        researchRepository.updateResearcher(id, updatedResearcher);
    }

    public void showResearcherDetails(String id) {
        Researcher researcher = researchRepository.findResearcherById(id);
        if (researcher != null) {
            System.out.println("Researcher Details:");
            System.out.println("Name: " + researcher.getName());
            System.out.println("Field of Study: " + researcher.getFieldOfStudy());
        } else {
            System.out.println("Researcher with ID " + id + " not found.");
        }
    }

    public void listAllResearchers() {
        List<User> users = userList;
        System.out.println("All Researchers:");
        for (User user : users) {
            if (user instanceof Researcher) {
                System.out.println(user.getName() + " (" + ((Researcher) user).getFieldOfStudy() + ")");
            }
        }
    }
}