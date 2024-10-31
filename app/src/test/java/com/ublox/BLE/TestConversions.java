package com.ublox.BLE;

import com.ublox.BLE.activities.MainActivity;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.jupiter.api.Test;

public class TestConversions {

    @org.junit.jupiter.api.Test
    public void stringOfFewBytes() {
        assertThat(MainActivity.transferAmount(256L), equalTo("256 B"));
    }

    @org.junit.jupiter.api.Test
    public void stringOfKiloByte() {
        assertThat(MainActivity.transferAmount(1024L), equalTo("1.00 KB"));
    }

    @org.junit.jupiter.api.Test
    public void stringOfFractionalKiloByte() {
        assertThat(MainActivity.transferAmount(1536L), equalTo("1.50 KB"));
    }

    @org.junit.jupiter.api.Test
    public void stringOfMegaByte() {
        assertThat(MainActivity.transferAmount(1048576L), equalTo("1.00 MB"));
    }

    @org.junit.jupiter.api.Test
    public void stringOfFractionalMegaByte() {
        assertThat(MainActivity.transferAmount(1572864L), equalTo("1.50 MB"));
    }

    @org.junit.jupiter.api.Test
    public void stringOfGigaByte() {
        assertThat(MainActivity.transferAmount(1073741824L), equalTo("1.00 GB"));
    }

    @Test
    public void stringOfFractionalGigaByte() {
        assertThat(MainActivity.transferAmount(1610612736L), equalTo("1.50 GB"));
    }

    @org.junit.jupiter.api.Test
    public void stringOfTransferRate() {
        assertThat(MainActivity.transferRate(15431, 1000000000), equalTo("123.45 kbps"));
    }
}
