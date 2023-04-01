
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author theo.higgins
 */
public class Hideout<T> {

    private T object;

    public Hideout() {
        this.object = null;
    }

    public void putIntoHideout(T toHide) {

        if (this.object.equals(toHide)) {
            this.object = null;
        } else {
            this.object = toHide;
        }

    }

    public T takeFromHideout() {
        T returnObject = this.object;
        this.object = null;
        return returnObject;
    }

    public boolean isInHideout() {
        return this.object.equals(null) ? false : true;
    }
}
