package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank
    @Size(max = 250, message = "Description may not be longer than 250 characters")
    private String description;

    public Skill(String description, List<Job> jobs) {
        this.description = description;
        this.jobs = jobs;
    }

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJob(List<Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "jobs=" + jobs +
                ", description='" + description + '\'' +
                '}';
    }
}
