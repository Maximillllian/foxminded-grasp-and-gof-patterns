package creational_patterns.builder;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Pizza {
    private Boolean cheese;
    private Boolean bacon;
    private Boolean pineapples;
    private Boolean mushrooms;
    private Boolean crustaceans;

    public Pizza(PizzaBuilder builder) {
        this.cheese = builder.getCheese();
        this.bacon = builder.getBacon();
        this.pineapples = builder.getPineapples();
        this.mushrooms = builder.getMushrooms();
        this.crustaceans = builder.getCrustaceans();
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    @Getter
    public static class PizzaBuilder {
        private Boolean cheese;
        private Boolean bacon;
        private Boolean pineapples;
        private Boolean mushrooms;
        private Boolean crustaceans;

        public Pizza build() {
            return new Pizza(this);
        }

        public PizzaBuilder cheese(Boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder bacon(Boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public PizzaBuilder crustaceans(Boolean crustaceans) {
            this.crustaceans = crustaceans;
            return this;
        }

        public PizzaBuilder pineapples(Boolean pineapples) {
            this.pineapples = pineapples;
            return this;
        }

        public PizzaBuilder mushrooms(Boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }
    }
}
