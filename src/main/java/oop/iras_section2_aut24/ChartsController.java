package oop.iras_section2_aut24;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.*;

import java.io.IOException;

public class ChartsController {
    @javafx.fxml.FXML
    private PieChart chart;

    @javafx.fxml.FXML
    public void onLoadButtonClick(ActionEvent actionEvent) {
//        chart.getData().clear();
//        XYChart.Series<String, Integer> s1 = new XYChart.Series<>();
//        s1.setName("2022");
//        s1.getData().add(new XYChart.Data<>("Dhaka", 37));
//        s1.getData().add(new XYChart.Data<>("Rajshahi", 35));
//        s1.getData().add(new XYChart.Data<>("Khulna", 14));
//        s1.getData().add(new XYChart.Data<>("Chittagong", 98));
//
//        XYChart.Series<String, Integer> s2 = new XYChart.Series<>();
//        s2.setName("2023");
//        s2.getData().add(new XYChart.Data<>("Dhaka", 92));
//        s2.getData().add(new XYChart.Data<>("Rajshahi", 14));
//        s2.getData().add(new XYChart.Data<>("Khulna", 93));
//        s2.getData().add(new XYChart.Data<>("Chittagong", 78));
//
//        XYChart.Series<String, Integer> s3 = new XYChart.Series<>();
//        s3.setName("2024");
//        s3.getData().add(new XYChart.Data<>("Dhaka", 50));
//        s3.getData().add(new XYChart.Data<>("Rajshahi", 6));
//        s3.getData().add(new XYChart.Data<>("Khulna", 13));
//        s3.getData().add(new XYChart.Data<>("Chittagong", 37));
//
//        chart.getData().add(s1);
//        chart.getData().addAll(s2, s3);

        chart.getData().add(new PieChart.Data("Dhaka", 92));
        chart.getData().add(new PieChart.Data("Rajshahi", 14));
        chart.getData().add(new PieChart.Data("Khulna", 93));
        chart.getData().add(new PieChart.Data("Chittagong", 78));
    }

    @FXML
    protected void onLogOutButtonClick(ActionEvent event) throws IOException {
        SceneManager.logOut();
    }

    @FXML
    protected void onBackButtonClick(ActionEvent event) throws IOException {
        SceneManager.switchScene("dashboard.fxml");
    }
}
