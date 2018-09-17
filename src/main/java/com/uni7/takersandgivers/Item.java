package com.uni7.takersandgivers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Antenas on 17/09/2018.
 **/
@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer qty;
}
