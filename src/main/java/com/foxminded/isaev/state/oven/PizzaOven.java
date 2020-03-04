package com.foxminded.isaev.state.oven;

public class PizzaOven {

    private PizzaOvenState state = new CooledOvenState();

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void bake() {
        try {
            state.bake();
        } catch (OvenBakeryException e) {
            System.out.println(e.getMessage());
        }
    }

    private class CooledOvenState implements PizzaOvenState {

        @Override
        public void next(PizzaOven oven) {
            oven.setState(new ReadyOvenState());
        }

        @Override
        public void prev(PizzaOven oven) {

        }

        @Override
        public void bake() throws OvenBakeryException {
            throw new OvenBakeryException("Cannot bake in the cooled oven");
        }

    }

    private class ReadyOvenState implements PizzaOvenState {

        @Override
        public void next(PizzaOven oven) {
            oven.setState(new OverheatedOvenState());
        }

        @Override
        public void prev(PizzaOven oven) {
            oven.setState(new CooledOvenState());
        }

        @Override
        public void bake() {
            System.out.println("Pizza is ready to be eaten!");
        }
    }

    private class OverheatedOvenState implements PizzaOvenState {

        @Override
        public void next(PizzaOven oven) {
        }

        @Override
        public void prev(PizzaOven oven) {
            oven.setState(new ReadyOvenState());
        }

        @Override
        public void bake() throws OvenBakeryException {
            throw new OvenBakeryException("Cannot bake in the overheated oven");
        }
    }

    public void setState(PizzaOvenState state) {
        this.state = state;
    }
}
