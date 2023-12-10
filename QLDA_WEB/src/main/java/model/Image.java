package model;

public class Image {
    private String linkImageTrue;
    private String linkImageFalse;

    public Image(String linkImageTrue, String linkImageFalse) {
        this.linkImageTrue = linkImageTrue;
        this.linkImageFalse = linkImageFalse;
    }

    public String getLinkImageTrue() {
        return linkImageTrue;
    }

    public void setLinkImageTrue(String linkImageTrue) {
        this.linkImageTrue = linkImageTrue;
    }

    public String getLinkImageFalse() {
        return linkImageFalse;
    }

    public void setLinkImageFalse(String linkImageFalse) {
        this.linkImageFalse = linkImageFalse;
    }
}
