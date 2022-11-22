package org.ilhamakbar.fundal.gui;

public class Udean {
    private String NoHp;
    private String NoToken;

    public Udean() {
    }

    public Udean(String noHp, String noToken) {
        NoHp = noHp;
        NoToken = noToken;
    }

    public String getNoHp() {
        return NoHp;
    }

    public void setNoHp(String noHp) {
        NoHp = noHp;
    }

    public String getNoToken() {
        return NoToken;
    }

    public void setNoToken(String noToken) {
        NoToken = noToken;
    }

    @Override
    public String toString() {
        return "Udean{" +
                "NoHp='" + NoHp + '\'' +
                ", NoToken='" + NoToken + '\'' +
                '}';
    }
}
