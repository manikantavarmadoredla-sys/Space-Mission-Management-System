
package com.example.SpaceMissionManagement;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.SpaceMissionManagement.entity.SpaceMission;
import com.example.SpaceMissionManagement.service.SpaceMissionService;

@SpringBootApplication
public class SpaceMissionManagementApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(
                        SpaceMissionManagementApplication.class, args);

        SpaceMissionService service =
                context.getBean(SpaceMissionService.class);

        System.out.println("\n========== SPACE MISSION MANAGEMENT ==========\n");

        // 1. Find missions by agency
        System.out.println("1. FIND MISSIONS BY AGENCY (ISRO)");
        List<SpaceMission> missions1 =
                service.getMissionsByAgency("ISRO");
        missions1.forEach(System.out::println);

        // 2. Find missions by destination
        System.out.println("\n2. FIND MISSIONS BY DESTINATION (Moon)");
        List<SpaceMission> missions2 =
                service.getMissionsByDestination("Moon");
        missions2.forEach(System.out::println);

        // 3. Find missions with budget greater than
        System.out.println("\n3. BUDGET GREATER THAN 1000");
        List<SpaceMission> missions3 =
                service.getMissionsWithBudgetGreaterThan(1000.0);
        missions3.forEach(System.out::println);

        // 4. Find missions launched after a year
        System.out.println("\n4. MISSIONS LAUNCHED AFTER 2020");
        List<SpaceMission> missions4 =
                service.getMissionsLaunchedAfter(2020);
        missions4.forEach(System.out::println);

        // 5. Find missions by status
        System.out.println("\n5. FIND COMPLETED MISSIONS");
        List<SpaceMission> missions5 =
                service.getMissionsByStatus("COMPLETED");
        missions5.forEach(System.out::println);

        // 6. Find missions by agency and destination
        System.out.println("\n6. ISRO MISSIONS TO MOON");
        List<SpaceMission> missions6 =
                service.getMissionsByAgencyAndDestination("ISRO", "Moon");
        missions6.forEach(System.out::println);

        // 7. Find missions within budget range
        System.out.println("\n7. MISSIONS WITH BUDGET BETWEEN 300 AND 2000");
        List<SpaceMission> missions7 =
                service.getMissionsByBudgetRange(300.0, 2000.0);
        missions7.forEach(System.out::println);

        // 8. Order missions by launch year descending
        System.out.println("\n8. MISSIONS ORDERED BY LAUNCH YEAR DESCENDING");
        List<SpaceMission> missions8 =
                service.getMissionsOrderByLaunchYearDesc();
        missions8.forEach(System.out::println);

        // 9. Find maximum budget
        System.out.println("\n9. MAXIMUM BUDGET");
        System.out.println(service.getMaximumBudget());

        // 10. Find minimum budget
        System.out.println("\n10. MINIMUM BUDGET");
        System.out.println(service.getMinimumBudget());

        // 11. Count missions by agency
        System.out.println("\n11. COUNT ISRO MISSIONS");
        System.out.println(service.getMissionCountByAgency("ISRO"));

        // 12. Find average budget
        System.out.println("\n12. AVERAGE BUDGET");
        System.out.println(service.getAverageBudget());

        // 13. Update mission status
        System.out.println("\n13. UPDATE MISSION STATUS");
        int statusUpdated =
                service.updateMissionStatus(101L, "ACTIVE");
        System.out.println("Rows updated: " + statusUpdated);

        // 14. Update mission budget
        System.out.println("\n14. UPDATE MISSION BUDGET");
        int budgetUpdated =
                service.updateMissionBudget(102L, 550.0);
        System.out.println("Rows updated: " + budgetUpdated);

        // 15. Delete mission by ID
        // Kept commented to preserve your 10 sample records.
        System.out.println("\n15. DELETE MISSION BY ID");
        // int deleted = service.deleteMissionById(110L);
        // System.out.println("Rows deleted: " + deleted);

        System.out.println("\n========== EXECUTION COMPLETED ==========");

        context.close();
    }
}
