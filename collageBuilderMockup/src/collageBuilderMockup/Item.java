package collageBuilderMockup;

public class Item {
    String link;
    Image image;

    public Image getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }

    class Image {
        int height;
        int width;
        int byteSize;
        String thumbnailLink;
        int thumbnailHeight;
        int thumbnailWidth;

        public int getHeight() {
            return height;
        }

        public int getWidth() {
            return width;
        }

        public int getByteSize() {
            return byteSize;
        }

        public String getThumbnailLink() {
            return thumbnailLink;
        }

        public int getThumbnailHeight() {
            return thumbnailHeight;
        }

        public int getThumbnailWidth() {
            return thumbnailWidth;
        }
    }
}
