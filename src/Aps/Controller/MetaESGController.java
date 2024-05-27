package aps.Controller;

import aps.Model.MetaESG;
import aps.View.MetaESGView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MetaESGController {
    private MetaESGView view;
    private List<MetaESG> metas;

    private static final double META_CONSUMO_AGUA = 300.0;
    private static final double META_MATERIAIS_SUSTENTAVEIS = 50.0;
    private static final double META_EMISSOES_GEE = 0.5;
    private static final double META_TFAT = 0.0;
    private static final double META_EMPREGOS_LOCAIS = 100.0;

    public MetaESGController(MetaESGView view) {
        this.view = view;
        this.metas = new ArrayList<>();

        this.view.getAdicionarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarMeta();
            }
        });
    }

    private void adicionarMeta() {
        double consumoAgua = view.getConsumoAgua();
        double materiaisSustentaveis = view.getMateriaisSustentaveis();
        double emissoesGEE = view.getEmissoesGEE();
        double tfat = view.getTfat();
        double empregosLocais = view.getEmpregosLocais();

        MetaESG meta = new MetaESG(consumoAgua, materiaisSustentaveis, emissoesGEE, tfat, empregosLocais);
        metas.add(meta);
        view.addMetaToList(meta.toString());
        view.clearFields();

        double mediaMetas = calcularMediaMetas();
        view.setMediaLabel("Média das Metas ESG: " + mediaMetas);

        String resultado = verificarMetas(meta);
        view.setResultadoLabel("Resultados das Metas: " + resultado);
    }

    private double calcularMediaMetas() {
        double soma = 0;
        for (MetaESG meta : metas) {
            soma += (meta.getConsumoAgua() + meta.getMateriaisSustentaveis() + meta.getEmissoesGEE() + meta.getTfat() + meta.getEmpregosLocais());
        }
        return soma / (metas.size() * 5);
    }

    private String verificarMetas(MetaESG meta) {
        StringBuilder resultado = new StringBuilder();

        resultado.append("Consumo de Água: ").append(meta.getConsumoAgua() <= META_CONSUMO_AGUA ? "Abaixo da meta\n" : "Acima da meta\n");
        resultado.append("Materiais Sustentáveis: ").append(meta.getMateriaisSustentaveis() >= META_MATERIAIS_SUSTENTAVEIS ? "Abaixo da meta\n" : "Acima da meta\n");
        resultado.append("Emissões GEE: ").append(meta.getEmissoesGEE() <= META_EMISSOES_GEE ? "Abaixo da meta\n" : "Acima da meta\n");
        resultado.append("TFAT: ").append(meta.getTfat() <= META_TFAT ? "Abaixo da meta\n" : "Acima da meta\n");
        resultado.append("Empregos Locais: ").append(meta.getEmpregosLocais() >= META_EMPREGOS_LOCAIS ? "Abaixo da meta\n" : "Acima da meta\n");

        return resultado.toString();
    }
}
