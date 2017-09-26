package core.com.aster.model.common;

import java.util.List;

public class SiteMapXml {

    private List<Sitemap> sitemapList;

    public static class Sitemap {
        private String loc;
        private String lastmod;
        private String priority;

        public String getLoc() {
            return loc;
        }

        public void setLoc(String loc) {
            this.loc = loc;
        }

        public String getLastmod() {
            return lastmod;
        }

        public void setLastmod(String lastmod) {
            this.lastmod = lastmod;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }
    }

    public List<Sitemap> getSitemapList() {
        return sitemapList;
    }

    public void setSitemapList(List<Sitemap> sitemapList) {
        this.sitemapList = sitemapList;
    }
}
