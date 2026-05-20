/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.udf.UI;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagemFundoCidade extends JPanel {
    private Image imagem;
    // Construtor que carrega a imagem do pacote de recursos
    public ImagemFundoCidade() {
        // Caminho da imagem (coloque na pasta raiz do projeto ou use caminho completo)
        // Altere "nomeimagem.png" para o nome do seu arquivo
        this.imagem = new ImageIcon(getClass().getResource("fundocidade.png")).getImage();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagem != null) {
            // Desenha a imagem preenchendo todo o espaÃ§o disponÃ­vel
            // g.drawImage(imagem, x, y, largura, altura, observador)
            // Usamos getWidth() e getHeight() para a imagem preencher todo o painel          
            g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
        }
    }
}