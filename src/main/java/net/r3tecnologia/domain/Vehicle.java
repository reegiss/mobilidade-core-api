package net.r3tecnologia.domain;


import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Vehicle.
 */
@Entity
@Table(name = "vehicle")
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Size(min = 8, max = 8)
    @Column(name = "placa", length = 8, nullable = false, unique = true)
    private String placa;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public Vehicle placa(String placa) {
        this.placa = placa;
        return this;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Vehicle)) {
            return false;
        }
        return id != null && id.equals(((Vehicle) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
            "id=" + getId() +
            ", placa='" + getPlaca() + "'" +
            "}";
    }
}
