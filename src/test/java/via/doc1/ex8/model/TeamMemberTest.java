package via.doc1.ex8.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamMemberTest {
    private TeamMember testTeamMember;

    @BeforeEach
    public void setUp() {
        String memberId = "Member1";
        String memberName = "Johnny";
        String memberEmail = "johnny@gmail.com";
        Task task1 = new Task("Task1", "Task1 Description", "Task1 Status");
        Task task2 = new Task("Task2", "Task2 Description", "Task2 Status");
        List<Task> tasks = List.of(task1, task2);
        testTeamMember = new TeamMember(memberId, memberName, memberEmail, tasks);
    }

    @Test
    public void getTeamMemberTest() {
        assertEquals("Member1", testTeamMember.getId());
        assertEquals("Johnny", testTeamMember.getName());
        assertEquals("johnny@gmail.com", testTeamMember.getEmail());
    }
}
