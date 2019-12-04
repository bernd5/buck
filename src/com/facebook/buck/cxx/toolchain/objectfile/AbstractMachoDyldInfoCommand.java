/*
 * Copyright 2019-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.buck.cxx.toolchain.objectfile;

import com.facebook.buck.core.util.immutables.BuckStyleImmutable;
import org.immutables.value.Value;

/**
 * Represents the LC_DYLD_INFO/LC_DYLD_INFO_ONLY command. For reference, see "struct
 * dyld_info_command" at
 * https://opensource.apple.com/source/xnu/xnu-1699.32.7/EXTERNAL_HEADERS/mach-o/loader.h
 */
@Value.Immutable
@BuckStyleImmutable
abstract class AbstractMachoDyldInfoCommand {

  @Value.Parameter
  abstract int getCommand();

  @Value.Parameter
  abstract int getCommandSize();

  @Value.Parameter
  abstract int getRebaseInfoOffset();

  @Value.Parameter
  abstract int getRebaseInfoSize();

  @Value.Parameter
  abstract int getBindInfoOffset();

  @Value.Parameter
  abstract int getBindInfoSize();

  @Value.Parameter
  abstract int getWeakBindInfoOffset();

  @Value.Parameter
  abstract int getWeakBindInfoSize();

  @Value.Parameter
  abstract int getLazyBindInfoOffset();

  @Value.Parameter
  abstract int getLazyBindInfoSize();

  @Value.Parameter
  abstract int getExportInfoOffset();

  @Value.Parameter
  abstract int getExportInfoSize();
}
