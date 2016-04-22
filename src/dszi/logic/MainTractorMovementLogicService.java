package dszi.logic;

import dszi.model.Tractor;

import java.util.Random;

import static java.lang.Math.abs;

/**
 * Created by softra43 on 20.04.2016.
 */
public class MainTractorMovementLogicService {

    Location targetLocation;

    Tractor tractor;

    public MainTractorMovementLogicService(Location targetLocation, Tractor tractor) {

        this.targetLocation = targetLocation;
        this.tractor = tractor;
    }

    public Location getTargetLocation() {
        return targetLocation;
    }

    public void setTargetLocation(Location targetLocation) {
        this.targetLocation = targetLocation;
    }

    public Tractor getTractor() {
        return tractor;
    }

    public void setTractor(Tractor tractor) {
        this.tractor = tractor;
    }

    // https://github.com/rogemus/SZI/blob/master/WaiterMovement.cpp
    // true - jest u celu, w przeciwnym wypadku false
    public boolean calculateTractorTurn() {
        Location tractorLocation = tractor.getLocation();
        int x = tractorLocation.getX();
        int y = tractorLocation.getY();

        Random random = new Random();

        boolean axis;
        if (abs(targetLocation.getX() - tractorLocation.getX()) <= 1 &&
                abs(targetLocation.getX() - tractorLocation.getX()) <= 1) {
            return true;
        } else if (targetLocation.getX() == tractorLocation.getY()) {
            axis = false;
        } else if (targetLocation.getX() == tractorLocation.getY()) {
            axis = true;
        } else {
            axis = (random.nextBoolean());
        }

        int ax = 0;
        int ay = 0;
        if (axis) {
            ax = (tractorLocation.getX() < targetLocation.getX()) ? 1 : -1;
        } else {
            ay = (tractorLocation.getY() < targetLocation.getY()) ? 1 : -1;
        }

        tractorLocation.setX(tractorLocation.getX() + ax);
        tractorLocation.setY(tractorLocation.getY() + ay);
        return false;
    }

}
