package project_euler.di;

import com.google.inject.AbstractModule;
import project_euler.math.prime.PrimeRepository;

public class ModuleDi extends AbstractModule {

    @Override
    protected void configure() {
        bind(PrimeRepository.class).toInstance(new PrimeRepository("data/prime_numbers.txt"));
    }
}
