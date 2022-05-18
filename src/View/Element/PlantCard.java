package View.Element;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Armin on 6/28/2016.
 */
public class PlantCard extends JPanel implements MouseListener {

    private Image img;
<<<<<<< HEAD:src/View/Element/PlantCard.java
    private ActionListener actionListener;
=======
    private ActionListener al;
>>>>>>> master:src/PlantCard.java

    public PlantCard(Image img) {
        setSize(64, 90);
        this.img = img;
        addMouseListener(this);
    }

<<<<<<< HEAD:src/View/Element/PlantCard.java
    public void setAction(ActionListener actionListener) {
        this.actionListener = actionListener;
=======
    public void setAction(ActionListener al) {
        this.al = al;
>>>>>>> master:src/PlantCard.java
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
<<<<<<< HEAD:src/View/Element/PlantCard.java
        if (actionListener != null) {
            actionListener.actionPerformed(new ActionEvent(this, ActionEvent.RESERVED_ID_MAX + 1, ""));
=======
        if (al != null) {
            al.actionPerformed(new ActionEvent(this, ActionEvent.RESERVED_ID_MAX + 1, ""));
>>>>>>> master:src/PlantCard.java
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
