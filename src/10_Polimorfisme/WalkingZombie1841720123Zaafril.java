/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10;

/**
 *
 * @author WINDOWS 10
 */
public class WalkingZombie1841720123Zaafril extends Zombie1841720123Zaafril {

    public WalkingZombie1841720123Zaafril(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void healZaafril() {
        switch(this.level){
            case 1: this.health += (20/100 * this.health);break;
            case 2: this.health += (30/100 * this.health);break;
            case 3: this.health += (40/100 * this.health);break;
        }
    }

    @Override
    public void destroyedZaafril() {
        this.health -= (20 * this.health / 100);
    }

    @Override
    public String getZombieInfoZaafril() {
        String info = super.getZombieInfoZaafril();
        return "Walking Zombie Data = \n"
        + info;
    }
}
