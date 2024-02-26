package universidade;

import java.util.ArrayList;
import java.util.List;

class Table {

    private List<Column> columns = new ArrayList<Column>();

    public void print(String prefix) {
        String postfix = "  ";
        int columnCount = this.columns.size();
        List<String> lines = new ArrayList<String>();
        lines.add(this.generateHeader(prefix, postfix));
        lines.add(this.generateSpacer(prefix, postfix));

        int lineIndex = 0;
        while (lineIndex < this.columns.get(0).getMaxSize()) {
            String line = prefix;
            for (int colIndex = 0; colIndex < columnCount; colIndex++) {
                Column col = this.columns.get(colIndex);
                line += col.getItem(lineIndex) + postfix;
            }
            lineIndex++;
            lines.add(line);
        }

        for (String _line : lines)
            System.out.println(_line);
    }

    public void print() {
        this.print("");
    }

    public Column addColumn(String header) {
        Column column = new Column(header);
        this.columns.add(column);
        return column;
    }

    public String generateHeader(String prefix, String postfix) {
        String result = prefix;
        for (Column col : this.columns) {
            String header = col.getHeader();
            while (header.length() < col.getMaxSize())
                header += " ";
            result += header;
            result += postfix;

        }
        return result;
    }

    public String generateSpacer(String prefix, String postfix) {
        String result = prefix;
        for (Column col : this.columns) {
            String spacer = "";
            while (spacer.length() < col.getMaxSize())
                spacer += "-";
            result += spacer;
            result += (postfix.replaceAll(".*", "-"));
        }
        return result;
    }

}

class Column {
    private int _biggestItemCount;
    private String header;
    private List<String> items = new ArrayList<String>();

    public Column(String header) {
        this.header = header;
        this._biggestItemCount = header.length();
    }

    public Column(String header, String[] items) {
        this.header = header;
        for (String item : items)
            this.push(item);
    }

    public void push(String item) {
        items.add(item);
        if (item.length() > this._biggestItemCount)
            this._biggestItemCount = item.length();
    }

    public String getHeader() {
        return this.header;
    }

    public String getItem(int index) {
        String result = this.items.get(index);
        while (result.length() < this._biggestItemCount) {
            result += " ";
        }
        return result;
    }

    public int getItemsCount() {
        return this.items.size();
    }

    public int getMaxSize() {
        return this._biggestItemCount;
    }

}