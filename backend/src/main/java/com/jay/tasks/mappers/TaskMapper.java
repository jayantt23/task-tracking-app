package com.jay.tasks.mappers;

import com.jay.tasks.domain.dto.TaskDto;
import com.jay.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

}
