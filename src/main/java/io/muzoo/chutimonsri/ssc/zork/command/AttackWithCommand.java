package io.muzoo.chutimonsri.ssc.zork.command;

import io.muzoo.chutimonsri.ssc.zork.Game;
import io.muzoo.chutimonsri.ssc.zork.room.Monster;
import io.muzoo.chutimonsri.ssc.zork.room.Player;

public class AttackWithCommand implements Command {
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public void execute(Game game, String argument) {
        Monster monster = game.currentRoom.getMonster();
        Player player = game.player;
        if (monster.isAlive()){
            if (monster.isAlive()){
                if (player.hasItem()){
                    monster.getAttack(player.getAttackPower()+game.player.getItem().getAttackPower());
                    if (monster.getCurrentHP()>0){
                        System.out.println("Monster's HP: "+ monster.getCurrentHP() +" / "+monster.getMaxHP());
                    }
                    else {
                        System.out.println("You have killed Monster");
                        game.exit();
                    }
                }
            }
        }
        if (monster.getAttackPower()!=0){
            int attackPower=monster.getAttackPower();
            player.getAttack(attackPower);
            if (player.getCurrentHP()>0){
                System.out.println("Current player's HP: "+ player.getCurrentHP() +" / "+player.getMaxHP());
            }
            else {
                System.out.println("Monster killed you");
                game.exit();
            }

        }
    }
}