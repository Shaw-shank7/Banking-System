package Part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

class ReadAccounts {
    private LinkedList<String> firstNames = new LinkedList<>();
    private LinkedList<String> lastNames = new LinkedList<>();
    private LinkedList<Integer> accounts = new LinkedList<>();
    private LinkedList<Integer> balances = new LinkedList<>();

    ReadAccounts(String URL) {
        try (BufferedReader reader = new BufferedReader(new FileReader(URL))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                this.firstNames.add(values[0]);
                this.lastNames.add(values[1]);
                this.accounts.add(Integer.parseInt(values[2]));
                this.balances.add(Integer.parseInt(values[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public LinkedList<String> getFirstNames() {
        return this.firstNames;
    }

    public LinkedList<String> getLastNames() {
        return this.lastNames;
    }

    public LinkedList<Integer> getAccounts() {
        return this.accounts;
    }

    public LinkedList<Integer> getBalances() {
        return this.balances;
    }
}

