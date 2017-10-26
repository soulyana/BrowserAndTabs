package me.soulyana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ans = "";
        String tabAns, browserAns = "";
        Browser browser = new Browser();;
        Tabs tab;

        System.out.println("Enter the name of the internet browser: ");
        browserAns = scan.nextLine();
        if (!browserAns.equalsIgnoreCase("internet explorer")) {
            browser.setTitle(browserAns);

            do {
                tab = new Tabs();

                System.out.println("Enter the title of the tab: ");
                tabAns = scan.nextLine();
                tab.setTitle(tabAns);

                System.out.println("Enter the url of the tab: ");
                tabAns = scan.nextLine();
                tab.setUrl(tabAns);

                browser.addTab(tab);

                do {
                    System.out.println("Would you like to add another tab? (Y)es or (N)o");
                    ans = scan.nextLine();
                } while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));
            } while (ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));

            //Display Browser & tabs:
            System.out.println();
            System.out.println("Browser: " + browser.getTitle());
            System.out.println("~~~~~~~Open Tabs~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
            for (Tabs aTab : browser.getTabs()) {
                System.out.println("Tab title: " + aTab.getTitle());
                System.out.println("Tab url: " + aTab.getUrl());
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        } else {
            System.out.println("Use a different browser!");
        }
    }
}