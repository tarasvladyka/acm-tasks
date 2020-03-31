package task1011;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ImageFilter {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Image filterImage(Image image){
        Image filteredImage = new Image(image.getHeight(), image.getWidth());
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                filteredImage.setElement(i, j, getMedianaFor(image, i, j));
            }
        }
        return filteredImage;
    }

    private boolean checkIndex(Image image, int i, int j){
        return !(i < 0 || j < 0 || i >= image.getHeight() || j >= image.getWidth());
    }
    /*
    Медіана - елемент[n/2 + 1] ВІДСОРТОВАНОГО ПО НЕСПАДАННЮ масиву розміром n
    Створюємо масив з значень околу точки і повертаємо медіану з нього
     */
    private int getMedianaFor(Image image, int rowIndex, int colIndex) {
        List<Integer> temparr = new LinkedList<>();
        for(int i = rowIndex - radius; i <= rowIndex + radius; i++)
            for(int j = colIndex - radius; j <= colIndex + radius;j++)
                if(checkIndex(image, i, j))
                    temparr.add(image.getElement(i, j));
                else
                    temparr.add(0);

        Collections.sort(temparr);
        return temparr.get(temparr.size() / 2);
    }
}
