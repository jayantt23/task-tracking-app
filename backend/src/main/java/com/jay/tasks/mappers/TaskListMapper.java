package com.jay.tasks.mappers;

import com.jay.tasks.domain.dto.TaskListDto;
import com.jay.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);

}
