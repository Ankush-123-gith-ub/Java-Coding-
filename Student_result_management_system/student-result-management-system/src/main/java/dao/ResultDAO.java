package dao;

import model.Result;
import db.DatabaseManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class ResultDAO {

    private ArrayList<Result> results = new ArrayList<>();

    public void addResult(Result r) {
        results.add(r);

        try (Connection conn = DatabaseManager.getConnection()) {
            String query = "INSERT INTO results (rid, student_id, marks) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, r.getRid());
            ps.setInt(2, r.getStudentId());
            ps.setInt(3, r.getMarks());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("DB error: " + e.getMessage());
        }
    }

    public void viewResults() {
        for (Result r : results) {
            System.out.println(r);
        }
    }

    public void updateResult(int rid, int newMarks) {
        for (Result r : results) {
            if (r.getRid() == rid) {
                r.setMarks(newMarks);
            }
        }

        try (Connection conn = DatabaseManager.getConnection()) {
            String query = "UPDATE results SET marks=? WHERE rid=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, newMarks);
            ps.setInt(2, rid);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("DB error: " + e.getMessage());
        }
    }

    public void deleteResult(int rid) {
        results.removeIf(r -> r.getRid() == rid);

        try (Connection conn = DatabaseManager.getConnection()) {
            String query = "DELETE FROM results WHERE rid=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, rid);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("DB error: " + e.getMessage());
        }
    }
}
