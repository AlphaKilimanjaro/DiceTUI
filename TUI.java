// *** Copyright © 2019 Alpha Kilimanjaro. All rights reserved.

import java.util.Scanner;

class TUI {
    private int die1, die2;
    private int roll = 1;
    private Scanner input;

    private String[][] faces = {
        {
            "-------",
            "|     |",
            "|  *  |",
            "|     |",
            "-------"
        }, {
            "-------",
            "| *   |",
            "|     |",
            "|   * |",
            "-------"
        }, {
            "-------",
            "| *   |",
            "|  *  |",
            "|   * |",
            "-------"
        }, {
            "-------",
            "| * * |",
            "|     |",
            "| * * |",
            "-------"
        }, {
            "-------",
            "| * * |",
            "|  *  |",
            "| * * |",
            "-------"
        }, {
            "-------",
            "| * * |",
            "| * * |",
            "| * * |",
            "-------"
        }
    };

    public TUI() {
        input = new Scanner(System.in);
    }

    public void setDice(int d1, int d2) {
        die1 = d1;
        die2 = d2;
    }

    public void showDice() {
        System.out.println("Roll number: " + roll++);
        for (int i = 0; i < 5; i++)
            System.out.println(faces[die1-1][i] + "  " + faces[die2-1][i]);
        System.out.println();
    }

    public boolean requestRoll(int player) {
        System.out.println("Roll dice, player " + player + "..... <press ENTER>");
        String in = input.nextLine();
        if(in.equalsIgnoreCase("EXIT"))
            return false;
        return true;
    }

    public void welcome() {
        System.out.println("=============================");
        System.out.println("= ** * ** HyperDice v.0.1.0 =");
        System.out.println("=============================");
    }

    public void theEnd() {
        System.out.println("<THE END>");
    }

    //** Test functions ** */
    public void runGame() {
        welcome();
        if (requestRoll(1)) {
            setDice(1, 3);
            showDice();
        }
        theEnd();
        input.nextLine();
        input.close();
    }

    public static void main(String[] args) {
        TUI tui = new TUI();
        tui.runGame();
    }
}