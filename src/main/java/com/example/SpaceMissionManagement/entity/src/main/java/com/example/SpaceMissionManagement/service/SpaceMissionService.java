
package com.example.SpaceMissionManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SpaceMissionManagement.entity.SpaceMission;
import com.example.SpaceMissionManagement.repository.SpaceMissionRepository;

@Service
@Transactional
public class SpaceMissionService {

    private final SpaceMissionRepository repository;

    public SpaceMissionService(SpaceMissionRepository repository) {
        this.repository = repository;
    }

    // 1. Find missions by agency name
    public List<SpaceMission> getMissionsByAgency(String agencyName) {
        return repository.findByAgencyName(agencyName);
    }

    // 2. Find missions by destination
    public List<SpaceMission> getMissionsByDestination(String destination) {
        return repository.findByDestination(destination);
    }

    // 3. Find missions with budget greater than
    public List<SpaceMission> getMissionsWithBudgetGreaterThan(Double budget) {
        return repository.findByBudgetGreaterThan(budget);
    }

    // 4. Find missions launched after a year
    public List<SpaceMission> getMissionsLaunchedAfter(Integer year) {
        return repository.findByLaunchYearAfter(year);
    }

    // 5. Find missions by status
    public List<SpaceMission> getMissionsByStatus(String status) {
        return repository.findByMissionStatus(status);
    }

    // 6. Find missions by agency and destination
    public List<SpaceMission> getMissionsByAgencyAndDestination(
            String agencyName, String destination) {
        return repository.findByAgencyAndDestination(agencyName, destination);
    }

    // 7. Find missions within budget range
    public List<SpaceMission> getMissionsByBudgetRange(
            Double minBudget, Double maxBudget) {
        return repository.findByBudgetBetween(minBudget, maxBudget);
    }

    // 8. Find all missions ordered by launch year descending
    public List<SpaceMission> getMissionsOrderByLaunchYearDesc() {
        return repository.findAllOrderByLaunchYearDesc();
    }

    // 9. Find maximum budget
    public Double getMaximumBudget() {
        return repository.findMaximumBudget();
    }

    // 10. Find minimum budget
    public Double getMinimumBudget() {
        return repository.findMinimumBudget();
    }

    // 11. Count missions by agency
    public Long getMissionCountByAgency(String agencyName) {
        return repository.countMissionsByAgency(agencyName);
    }

    // 12. Find average budget
    public Double getAverageBudget() {
        return repository.findAverageBudget();
    }

    // 13. Update mission status by ID
    public int updateMissionStatus(Long missionId, String status) {
        return repository.updateMissionStatus(missionId, status);
    }

    // 14. Update mission budget by ID
    public int updateMissionBudget(Long missionId, Double budget) {
        return repository.updateMissionBudget(missionId, budget);
    }

    // 15. Delete mission by ID
    public int deleteMissionById(Long missionId) {
        return repository.deleteMissionById(missionId);
    }
}
