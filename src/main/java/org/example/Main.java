package org.example;

import org.example.entity.Ladder;
import org.example.entity.Player;
import org.example.entity.Snake;
import org.example.service.SnakeAndLadderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of snakes :");
        int noOfSnakes = scanner.nextInt();
        List<Snake> snakes = new ArrayList<>();
        System.out.println("Enter start and tail of snakes: ");
        for (int i = 0; i < noOfSnakes; i++) {
            snakes.add(new Snake(scanner.nextInt(), scanner.nextInt()));
        }
        System.out.println("Enter number of ladder :");
        int noOfLadders = scanner.nextInt();
        List<Ladder> ladders = new ArrayList<Ladder>();
        System.out.println("Enter start and destiny of ladder");
        for (int i = 0; i < noOfLadders; i++) {
            ladders.add(new Ladder(scanner.nextInt(), scanner.nextInt()));
        }
        System.out.println("Enter number of players :");
        int noOfPlayers = scanner.nextInt();
        List<Player> players = new ArrayList<Player>();
        System.out.println("Enter name of players");
        for (int i = 0; i < noOfPlayers; i++) {
            players.add(new Player(scanner.next()));
        }

        SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();
        snakeAndLadderService.setPlayers(players);
        snakeAndLadderService.setSnakes(snakes);
        snakeAndLadderService.setLadders(ladders);

        snakeAndLadderService.startGame();
    }
}