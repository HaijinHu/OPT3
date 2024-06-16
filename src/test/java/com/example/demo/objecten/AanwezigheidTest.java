package com.example.demo.objecten;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CONDITION_COVERAGE_TEST {
    @Test
    public void testDateLocatienull() {
        String tijd = ("10:00-11:00");
        String date = ("null");
        String locatie = (null);
        String loginmessage = Aanwezigheid.PlanAN(date,tijd, locatie);
        Assert.assertEquals("U moet alle vakjes invullen.", loginmessage);
    }
    @Test
    public void testTijdnull() {
        String tijd = (null);
        String date = ("12-20-2003");
        String locatie = ("den haag");
        String loginmessage = Aanwezigheid.PlanAN(date,tijd,locatie);
        Assert.assertEquals("U moet uw tijd invullen.", loginmessage);
    }
}
class DECISION_COVERAGE_TEST {
    @Test
    public void testnotnull() {
        String tijd = ("10:00-11:00");
        String date = ("12-20-2003");
        String locatie = ("den haag");
        String loginmessage = Aanwezigheid.PlanAN(date,tijd,locatie);
        Assert.assertEquals("Uw aanwezigheid dag is ingepland.", loginmessage);
    }

    @Test
    public void testnull() {
        String tijd = (null);
        String date = ("null");
        String locatie = (null);
        String loginmessage = Aanwezigheid.PlanAN(date,tijd,locatie);
        Assert.assertEquals("U moet alle vakjes invullen.", loginmessage);
    }
}
class CONDITION_DECISION_COVERAGE_TEST {
    @Test
    public void testnotnull() {
        String tijd = ("10:00-11:00");
        String date = ("12-20-2003");
        String locatie = ("den haag");
        String loginmessage = Aanwezigheid.PlanAN(date,tijd,locatie);
        Assert.assertEquals("Uw aanwezigheid dag is ingepland.", loginmessage);
    }

    @Test
    public void testnull() {
        String tijd = (null);
        String date = ("null");
        String locatie = (null);
        String loginmessage = Aanwezigheid.PlanAN(date,tijd,locatie);
        Assert.assertEquals("U moet alle vakjes invullen.", loginmessage);
    }
}
class MODIFIED_CONDITION_DECISION_COVERAGE_TEST {
    @Test
    public void testnotnull() {
        String tijd = ("10:00-11:00");
        String date = ("12-20-2003");
        String locatie = ("den haag");
        String loginmessage = Aanwezigheid.PlanAN(date,tijd,locatie);
        Assert.assertEquals("Uw aanwezigheid dag is ingepland.", loginmessage);
    }
    @Test
    public void testTijdnull() {
        String tijd = (null);
        String date = ("12-20-2003");
        String locatie = ("den haag");
        String loginmessage = Aanwezigheid.PlanAN(date,tijd,locatie);
        Assert.assertEquals("U moet uw tijd invullen.", loginmessage);
    }
    @Test
    public void testDatenull() {
        String tijd = ("10:00-11:00");
        String date = ("null");
        String locatie = ("den haag");
        String loginmessage = Aanwezigheid.PlanAN(date,tijd, locatie);
        Assert.assertEquals("U moet uw datum invullen.", loginmessage);
    }
    @Test
    public void testLocatienull() {
        String tijd = ("10:00-11:00");
        String date = ("12-20-2003");
        String locatie = (null);
        String loginmessage = Aanwezigheid.PlanAN(date,tijd, locatie);
        Assert.assertEquals("U moet uw locatie invullen.", loginmessage);
    }
}

class MULTIPLE_CONDITION_COVERAGE_TEST {
    @Test
    public void testnotnull() {
        String tijd = ("10:00-11:00");
        String date = ("12-20-2003");
        String locatie = ("den haag");
        String loginmessage = Aanwezigheid.PlanAN(date,tijd,locatie);
        Assert.assertEquals("Uw aanwezigheid dag is ingepland.", loginmessage);
    }

    @Test
    public void testnull() {
        String tijd = (null);
        String date = ("null");
        String locatie = (null);
        String loginmessage = Aanwezigheid.PlanAN(date,tijd,locatie);
        Assert.assertEquals("U moet alle vakjes invullen.", loginmessage);
    }
    @Test
    public void testTijdnull() {
        String tijd = (null);
        String date = ("12-20-2003");
        String locatie = ("den haag");
        String loginmessage = Aanwezigheid.PlanAN(date,tijd,locatie);
        Assert.assertEquals("U moet uw tijd invullen.", loginmessage);
    }
    @Test
    public void testDatenull() {
        String tijd = ("10:00-11:00");
        String date = ("null");
        String locatie = ("den haag");
        String loginmessage = Aanwezigheid.PlanAN(date,tijd, locatie);
        Assert.assertEquals("U moet uw datum invullen.", loginmessage);
    }
    @Test
    public void testLocatienull() {
        String tijd = ("10:00-11:00");
        String date = ("12-20-2003");
        String locatie = (null);
        String loginmessage = Aanwezigheid.PlanAN(date,tijd, locatie);
        Assert.assertEquals("U moet uw locatie invullen.", loginmessage);
    }
    @Test
    public void testTijdDatenull() {
        String tijd = (null);
        String date = ("null");
        String locatie = ("den haag");
        String loginmessage = Aanwezigheid.PlanAN(date,tijd,locatie);
        Assert.assertEquals("U moet alle vakjes invullen.", loginmessage);
    }
    @Test
    public void testTijdLocatienull() {
        String tijd = (null);
        String date = ("12-20-2003");
        String locatie = (null);
        String loginmessage = Aanwezigheid.PlanAN(date,tijd,locatie);
        Assert.assertEquals("U moet alle vakjes invullen.", loginmessage);
    }
    @Test
    public void testDateLocatienull() {
        String tijd = ("10:00-11:00");
        String date = ("null");
        String locatie = (null);
        String loginmessage = Aanwezigheid.PlanAN(date,tijd, locatie);
        Assert.assertEquals("U moet alle vakjes invullen.", loginmessage);
    }
}