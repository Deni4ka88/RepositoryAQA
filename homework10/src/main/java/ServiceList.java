
    public abstract class ServiceList {
        String oilName;
        int oilValue;
        boolean oilFilter;
        boolean airFilter;

        public ServiceList(String oilName, int oilValue, boolean oilFilter, boolean airFilter) {
            this.oilName = oilName;
            this.oilValue = oilValue;
            this.oilFilter = oilFilter;
            this.airFilter = airFilter;
        }
    }
