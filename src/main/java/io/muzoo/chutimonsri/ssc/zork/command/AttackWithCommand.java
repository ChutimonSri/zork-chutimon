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
        if (game.currentRoom.hasMonster()){
            if (game.currentRoom.getMonster().isAlive()){
                if (game.currentRoom.getMonster().isAlive()){
                    if (game.player.hasItem()){
                        game.currentRoom.getMonster().getAttack(game.player.getAttackPower()+game.player.getItem().getAttackPower());
                        if (game.currentRoom.getMonster().getCurrentHP()>0){
                            System.out.println("Monster's HP: "+ game.currentRoom.getMonster().getCurrentHP() +" / "+game.currentRoom.getMonster().getMaxHP());
                            if (game.currentRoom.getMonster().getAttackPower()!=0){
                                int attackPower=game.currentRoom.getMonster().getAttackPower();
                                game.player.getAttack(attackPower);
                                if (game.player.getCurrentHP()>0){
                                    System.out.println("Current player's HP: "+ game.player.getCurrentHP() +" / "+game.player.getMaxHP());
                                }
                                else {
                                    System.out.println("Monster killed you");
                                    game.exit();
                                }
                            }
                        }
                        else {
                            System.out.println("You have killed Monster");
                            game.exit();
                        }

                    }
                }
            }
        }
        else {
            System.out.println("This room has no monster");
        }


    }
}