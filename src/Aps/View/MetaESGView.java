package aps.View;

import javax.swing.*;
import java.awt.*;

public class MetaESGView extends JFrame {
    private JTextField consumoAguaField;
    private JTextField materiaisSustentaveisField;
    private JTextField emissoesGEEField;
    private JTextField tfatField;
    private JTextField empregosLocaisField;
    private JButton adicionarButton;
    private JLabel mediaLabel;
    private JLabel resultadoLabel;
    private JTextArea resultadoTextArea;

    public MetaESGView() {
        setTitle("Gerenciador de Metas ESG");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        consumoAguaField = new JTextField(10);
        materiaisSustentaveisField = new JTextField(10);
        emissoesGEEField = new JTextField(10);
        tfatField = new JTextField(10);
        empregosLocaisField = new JTextField(10);
        adicionarButton = new JButton("Adicionar Meta");
        mediaLabel = new JLabel("Média das Metas ESG: ");
        resultadoLabel = new JLabel("Resultados das Metas: ");
        resultadoTextArea = new JTextArea(10, 30);
        resultadoTextArea.setEditable(false);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        panel.add(new JLabel("Consumo de Água (litros/m²):"), gbc);
        gbc.gridx++;
        panel.add(consumoAguaField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Materiais Sustentáveis (%):"), gbc);
        gbc.gridx++;
        panel.add(materiaisSustentaveisField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Emissões GEE (ton CO2/m²):"), gbc);
        gbc.gridx++;
        panel.add(emissoesGEEField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("TFAT:"), gbc);
        gbc.gridx++;
        panel.add(tfatField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Empregos Locais:"), gbc);
        gbc.gridx++;
        panel.add(empregosLocaisField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(adicionarButton, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        panel.add(mediaLabel, gbc);
        gbc.gridy++;
        panel.add(resultadoLabel, gbc);
        gbc.gridy++;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        panel.add(new JScrollPane(resultadoTextArea), gbc);

        add(panel);
    }

    // Métodos getters e setters
    public double getConsumoAgua() {
        return Double.parseDouble(consumoAguaField.getText());
    }

    public double getMateriaisSustentaveis() {
        return Double.parseDouble(materiaisSustentaveisField.getText());
    }

    public double getEmissoesGEE() {
        return Double.parseDouble(emissoesGEEField.getText());
    }

    public double getTfat() {
        return Double.parseDouble(tfatField.getText());
    }

    public double getEmpregosLocais() {
        return Double.parseDouble(empregosLocaisField.getText());
    }

    public void clearFields() {
        consumoAguaField.setText("");
        materiaisSustentaveisField.setText("");
        emissoesGEEField.setText("");
        tfatField.setText("");
        empregosLocaisField.setText("");
    }

    public JButton getAdicionarButton() {
        return adicionarButton;
    }

    public JTextArea getResultadoTextArea() {
        return resultadoTextArea;
    }

    public JLabel getMediaLabel() {
        return mediaLabel;
    }

    public JLabel getResultadoLabel() {
        return resultadoLabel;
    }

    public void setMediaLabel(String text) {
        mediaLabel.setText(text);
    }

    public void setResultadoLabel(String text) {
        resultadoLabel.setText(text);
    }

    public void setResultadoText(String text) {
        resultadoTextArea.setText(text);
    }

    public void addMetaToList(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
