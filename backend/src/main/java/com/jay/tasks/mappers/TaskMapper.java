package com.jay.tasks.mappers;

import com.jay.tasks.domain.dto.TaskDto;
import com.jay.tasks.domain.entities.Task;

public interface TaskMapper {

    public Task fromDto(TaskDto taskDto);

    public TaskDto toDto(Task task);

}
