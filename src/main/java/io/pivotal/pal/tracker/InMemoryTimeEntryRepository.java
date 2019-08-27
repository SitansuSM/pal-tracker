package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.List;

import static java.util.Arrays.asList;

public class InMemoryTimeEntryRepository {


    public TimeEntry create(TimeEntry timeEntry)
    {
       return new TimeEntry(123L,456L, LocalDate.parse("2017-01-08"),8);
    }

    public TimeEntry find(long id){
        return new TimeEntry(1L,123L,456L, LocalDate.parse("2017-01-08"),8);
    }


    public TimeEntry find_MissingEntry(long id){
        return new TimeEntry(1L,123L,456L, LocalDate.parse("2017-01-08"),8);
    }

    public List<TimeEntry> list()  {
        return asList(
                new TimeEntry(1L, 123L, 456L, LocalDate.parse("2017-01-08"), 8),
                new TimeEntry(2L, 789L, 654L, LocalDate.parse("2017-01-07"), 4)
        );
    }

    public TimeEntry update(TimeEntry timeEntry){
        return new TimeEntry(321L,654L, LocalDate.parse("2017-01-09"),5);
    }

    public TimeEntry update_MissingEntry(TimeEntry timeEntry){
        return new TimeEntry(321L,654L, LocalDate.parse("2017-01-09"),5);
    }

    public TimeEntry delete(TimeEntry timeEntry){

    }
}
