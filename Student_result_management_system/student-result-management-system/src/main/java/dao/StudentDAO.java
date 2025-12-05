package dao;

import model.Student;
import db.DatabaseManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class StudentDAO {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);

        try (Connection conn = DatabaseManager.getConnection()) {
            String query = "INSERT INTO students (id, name, course) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getCourse());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("DB error: " + e.getMessage());
        }
    }

    public void getAllStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void updateStudent(int id, String newName) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
            }
        }

        try (Connection conn = DatabaseManager.getConnection()) {
            String query = "UPDATE students SET name=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, newName);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("DB error: " + e.getMessage());
        }
    }

    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);

        try (Connection conn = DatabaseManager.getConnection()) {
            String query = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("DB error: " + e.getMessage());
        }
    }
}
