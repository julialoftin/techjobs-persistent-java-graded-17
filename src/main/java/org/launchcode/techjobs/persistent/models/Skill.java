package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private Job job;

    @NotBlank
    @Size(max = 250, message = "Description may not be longer than 250 characters")
    private String description;

    public Skill(String description) {
        this.description = description;
    }

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "job=" + job +
                ", description='" + description + '\'' +
                '}';
    }
}
