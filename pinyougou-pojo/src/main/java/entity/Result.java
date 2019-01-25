package entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Mugen 2019/1/15
 */

@Data
public class Result implements Serializable {

    private boolean success;

    private String message;

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}