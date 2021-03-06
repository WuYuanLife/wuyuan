package TriangLify;

import com.manolovn.colorbrewer.ColorBrewer;
import com.manolovn.trianglify.generator.color.ColorGenerator;

/**
 * Color brewer color generator
 *
 * @author manolovn
 */
public class BrewerColorGenerator implements ColorGenerator {

    private ColorBrewer palette;
    private int index = 0;
    private int[] colors;

    public BrewerColorGenerator(ColorBrewer palette) {
        this.palette = palette;
    }

    public void setCount(int count) {
        colors = palette.getColorPalette(count);
        index = 0;
    }

    @Override
    public int nextColor() {
        int color = colors[index];
        index++;
        return color;
    }
}
