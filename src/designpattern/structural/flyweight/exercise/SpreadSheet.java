package designpattern.structural.flyweight.exercise;

/**
 * We are going to build a spreadsheet application like Excel or Numbers.
 *
 * If you run the code in the Demo class, you'll see a 3*3 spreadsheet printed
 * on the console. So, a user can set various formatting attributes such as
 * font name, font size, bold, etc for each cell individually.
 *
 * The problem with the current implementation is that each cell is storing
 * its font family, font size and bold characteristics. What if many cells
 * share the same formatting attributes? Storing these attributes for every
 * cell would be a waste of memory. While this is not a big deal in a small
 * spreadsheet, it may cause our application to crash if we have a spreadsheet
 * with 100,000+ rows of data.
 *
 * Use the flyweight pattern to solve this problem.
 */

public class SpreadSheet {
    private final int MAX_ROWS = 3;
    private final int MAX_COLS = 3;
    private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];
    private CellContextFactory contextFactory;

    public SpreadSheet(CellContextFactory contextFactory) {
        this.contextFactory = contextFactory;

        generateCells();
    }

    public void setContent(int row, int col, String content) {
        ensureCellExists(row, col);

        cells[row][col].setContent(content);
    }

    // We could have a similar method font setting the fontSize or isBold
    // for a given cell. I've omitted that here.
    public void setFontFamily(int row, int col, String fontFamily) {
        ensureCellExists(row, col);

        var cell = cells[row][col];
        var currentContext = cell.getContext();
        var context = contextFactory.getContext(fontFamily, currentContext.getFontSize(), currentContext.isBold());
        cells[row][col].setContext(context);
    }

    private void ensureCellExists(int row, int col) {
        if (row < 0 || row >= MAX_ROWS)
            throw new IllegalArgumentException();

        if (col < 0 || col >= MAX_COLS)
            throw new IllegalArgumentException();
    }

    private void generateCells() {
        for (var row = 0; row < MAX_ROWS; row++)
            for (var col = 0; col < MAX_COLS; col++)
                cells[row][col] = new Cell(row, col, getDefaultContext());
    }

    private CellContext getDefaultContext() {
        // In a real app, these values should not be hardcoded here.
        // They should be read from a configuration file.
        return new CellContext("Times New Roman", 12, false);
    }

    public void render() {
        for (var row = 0; row < MAX_ROWS; row++)
            for (var col = 0; col < MAX_COLS; col++)
                cells[row][col].render();
    }
}
