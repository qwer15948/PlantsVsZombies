package View;

import Model.Plant.Plant;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Armin on 6/25/2016.
 */
public class Collider extends JPanel implements MouseListener {

<<<<<<< HEAD:src/View/Collider.java
    private ActionListener actionListener;

    public Collider() {
        setOpaque(false);
        addMouseListener(this);
=======
    private ActionListener al;

    public Collider() {
        //setBorder(new LineBorder(Color.RED));
        setOpaque(false);
        addMouseListener(this);
        //setBackground(Color.green);
>>>>>>> master:src/Collider.java
        setSize(100, 120);
    }

    public Plant assignedPlant;

    public void setPlant(Plant p) {
        assignedPlant = p;
    }

    public void removePlant() {
        assignedPlant.stop();
        assignedPlant = null;
    }

<<<<<<< HEAD:src/View/Collider.java
    public boolean isInsideCollider(int xPos) {
        return (xPos > getLocation().x) && (xPos < getLocation().x + 100);
    }

    public void setAction(ActionListener actionListener) {
        this.actionListener = actionListener;
=======
    public boolean isInsideCollider(int tx) {
        return (tx > getLocation().x) && (tx < getLocation().x + 100);
    }

    public void setAction(ActionListener al) {
        this.al = al;
>>>>>>> master:src/Collider.java
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
<<<<<<< HEAD:src/View/Collider.java
        if (actionListener != null) {
            actionListener.actionPerformed(new ActionEvent(this, ActionEvent.RESERVED_ID_MAX + 1, ""));
=======
        if (al != null) {
            al.actionPerformed(new ActionEvent(this, ActionEvent.RESERVED_ID_MAX + 1, ""));
>>>>>>> master:src/Collider.java
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
