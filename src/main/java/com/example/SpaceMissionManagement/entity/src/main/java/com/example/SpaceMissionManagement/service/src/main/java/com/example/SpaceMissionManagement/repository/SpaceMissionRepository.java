
package com.example.SpaceMissionManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;

import com.example.SpaceMissionManagement.entity.SpaceMission;

public interface SpaceMissionRepository
        extends JpaRepository<SpaceMission, Long> {

    // 1. Find by agency
    @Query("SELECT s FROM SpaceMission s WHERE s.agencyName = :agencyName")
    List<SpaceMission> findByAgencyName(@Param("agencyName") String agencyName);

    // 2. Find by destination
    @Query("SELECT s FROM SpaceMission s WHERE s.destination = :destination")
    List<SpaceMission> findByDestination(@Param("destination") String destination);

    // 3. Budget greater than
    @Query("SELECT s FROM SpaceMission s WHERE s.budget > :budget")
    List<SpaceMission> findByBudgetGreaterThan(@Param("budget") Double budget);

    // 4. Launched after year
    @Query("SELECT s FROM SpaceMission s WHERE s.launchYear > :year")
    List<SpaceMission> findByLaunchYearAfter(@Param("year") Integer year);

    // 5. Find by status
    @Query("SELECT s FROM SpaceMission s WHERE s.missionStatus = :status")
    List<SpaceMission> findByMissionStatus(@Param("status") String status);

    // 6. Agency and destination
    @Query("SELECT s FROM SpaceMission s WHERE s.agencyName = :agencyName AND s.destination = :destination")
    List<SpaceMission> findByAgencyAndDestination(
            @Param("agencyName") String agencyName,
            @Param("destination") String destination);

    // 7. Budget between
    @Query("SELECT s FROM SpaceMission s WHERE s.budget BETWEEN :minBudget AND :maxBudget")
    List<SpaceMission> findByBudgetBetween(
            @Param("minBudget") Double minBudget,
            @Param("maxBudget") Double maxBudget);

    // 8. Order by launch year descending
    @Query("SELECT s FROM SpaceMission s ORDER BY s.launchYear DESC")
    List<SpaceMission> findAllOrderByLaunchYearDesc();

    // 9. Maximum budget
    @Query("SELECT MAX(s.budget) FROM SpaceMission s")
    Double findMaximumBudget();

    // 10. Minimum budget
    @Query("SELECT MIN(s.budget) FROM SpaceMission s")
    Double findMinimumBudget();

    // 11. Count by agency
    @Query("SELECT COUNT(s) FROM SpaceMission s WHERE s.agencyName = :agencyName")
    Long countMissionsByAgency(@Param("agencyName") String agencyName);

    // 12. Average budget
    @Query("SELECT AVG(s.budget) FROM SpaceMission s")
    Double findAverageBudget();

    // 13. Update status
    @Modifying
    @Query("UPDATE SpaceMission s SET s.missionStatus = :status WHERE s.missionId = :missionId")
    int updateMissionStatus(
            @Param("missionId") Long missionId,
            @Param("status") String status);

    // 14. Update budget
    @Modifying
    @Query("UPDATE SpaceMission s SET s.budget = :budget WHERE s.missionId = :missionId")
    int updateMissionBudget(
            @Param("missionId") Long missionId,
            @Param("budget") Double budget);

    // 15. Delete mission
    @Modifying
    @Query("DELETE FROM SpaceMission s WHERE s.missionId = :missionId")
    int deleteMissionById(@Param("missionId") Long missionId);

}
